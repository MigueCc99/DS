# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module Practica1
  class Bicicleta
    attr_reader :id_bicicleta
    attr_accessor :se_ha_retirado

    def run()
      puts "Bicicleta #{@id_bicicleta} corriendo"
    end

    def stop()
      if (@se_ha_retirado == false) 
        puts "Bicicleta #{@id_bicicleta} acaba la carrera"
      else
        puts "Bicicleta #{@id_bicicleta} ABANDONA"
      end
    end
    
    def clone()
      
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
