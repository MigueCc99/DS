# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative("bicicleta.rb")

module Practica1
  class BicicletaMontana < Bicicleta
    @@contador_bicicleta = 0
    
    def clone()
      @@contador_bicicleta = @@contador_bicicleta + 1
      return BicicletaMontana.crear_bicicleta_con_id(@@contador_bicicleta)
    end
    
    def self.crear_bicicleta_sin_id()
      self.new(0)
    end

    def self.crear_bicicleta_con_id(id)
     self.new(id)
    end

    private
    def initialize(id)
      @id_bicicleta = id
      @se_ha_retirado = false
    end
  end
end
