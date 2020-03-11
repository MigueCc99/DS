# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor

module Practica1
  class Carrera

    attr_accessor :num_bicicletas
  
    def self.crear_carrera_sin_num()
      self.new(0)
    end

    def self.crear_carrera_con_num(num)
     self.new(num)
    end

    def initialize(num)
      @num_bicicletas = num
      @bicicletas = Array.new
    end
    
    def iniciar_carrera()
      for i in @bicicletas
        i.run()
      end
      sleep(2)
      for i in @bicicletas
        i.stop()
      end
    end
    
    def set_participantes(participantes) 
      @bicicletas = participantes
    end
  end
end

