#include "ComponenteEquipo.h"

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
