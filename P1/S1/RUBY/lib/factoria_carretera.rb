# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative("factoria_carrera_y_bicicleta.rb")
require_relative("carrera_carretera.rb")
require_relative("bicicleta_carretera.rb")

module Practica1
  class FactoriaCarretera < FactoriaCarreraYBicicleta
    def crear_carrera(num_bicicletas)
      nueva_carrera = CarreraCarretera.crear_carrera_sin_num()
      
      participantes = Array.new
      prototipo_bici = BicicletaCarretera.crear_bicicleta_con_id(0)
      
      for i in (0..num_bicicletas-1)
        bici_clonada = crear_bicicleta(prototipo_bici)
        
        if (i%11==0) 
          bici_clonada.se_ha_retirado = true
        end
        
        participantes << bici_clonada
      end
      
      nueva_carrera.set_participantes(participantes)
      
      return nueva_carrera
    end
    
    def crear_bicicleta(bicicleta)
      return bicicleta.clone()
    end
  end
end
