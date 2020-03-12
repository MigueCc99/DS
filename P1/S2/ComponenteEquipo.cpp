#include "ComponenteEquipo.h"

ComponenteEquipo () {
    this->nombre = "";
    this->precio = 0;
}

ComponenteEquipo::ComponenteEquipo (string nombre, int precio) {
  this->nombre = nombre;
  this->precio = precio;
}

int ComponenteEquipo::getPrecio () {
  return precio;
}
string ComponenteEquipo::getNombre (){
  return nombre;
}
