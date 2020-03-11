# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative "factoria_carretera.rb"
require_relative "factoria_montana.rb"

module Practica1
  
  class Main
    
    def self.main
      puts "Numero de bicicletas de carretera: "
      num_bicis = gets.to_i
      
      factoria1 = FactoriaCarretera.new
      carrera1 = factoria1.crear_carrera(num_bicis)
      
      carrera1.iniciar_carrera()
      
      puts "Numero de bicicletas de montana: "
      num_bicis = gets.to_i
      
      factoria2 = FactoriaMontana.new
      carrera2 = factoria2.crear_carrera(num_bicis)
      
      carrera2.iniciar_carrera()
    end
    
    
    
  end

Main.main()

end