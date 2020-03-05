SRC = src
INC = include
OBJ = obj
BIN = bin
CXX = g++
CPPFLAGS = -Wall -g  -I$(INC) -c --std=c++11

all:$(BIN)/Cliente

# ************ Compilación de módulos ************
$(BIN)/Cliente: $(OBJ)/cocinero_integral.o $(OBJ)/receta.o $(OBJ)/recetas.o $(OBJ)/ingrediente.o $(OBJ)/ingredientes.o $(OBJ)/instrucciones.o $(OBJ)/acciones.o
	$(CXX) -o $(BIN)/cocinero_integral	$(OBJ)/cocinero_integral.o  $(OBJ)/receta.o $(OBJ)/recetas.o $(OBJ)/ingrediente.o $(OBJ)/ingredientes.o $(OBJ)/instrucciones.o $(OBJ)/acciones.o

$(OBJ)/Equipo.o: $(SRC)/Equipo.cpp $(INC)/Equipo.h $(INC)/ComponenteEquipo.h
	$(CXX) $(CPPFLAGS)  $(SRC)/Equipo.cpp -o  $(OBJ)/Equipo.o

$(OBJ)/Bus.o: $(SRC)/Bus.cpp $(INC)/Bus.h $(INC)/VisitanteEquipo.h
	$(CXX) $(CPPFLAGS)  $(SRC)/Bus.cpp -o  $(OBJ)/Bus.o

$(OBJ)/Tarjeta.o: $(SRC)/Tarjeta.cpp $(INC)/Tarjeta.h
	$(CXX) $(CPPFLAGS)  $(SRC)/Tarjeta.cpp -o  $(OBJ)/Tarjeta.o

$(OBJ)/Disco.o: $(SRC)/Disco.cpp $(INC)/Disco.h
	$(CXX) $(CPPFLAGS)  $(SRC)/Disco.cpp -o  $(OBJ)/Disco.o

# ************ Limpieza ************
clean :
	-rm $(OBJ)/* $(SRC)/*~ $(INC)/*~ ./*~

mrproper : clean
	-rm $(BIN)/* doc/html/*
