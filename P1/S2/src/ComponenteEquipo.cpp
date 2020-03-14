#include "ComponenteEquipo.h"
#include "VisitanteEquipo.h"

ComponenteEquipo::ComponenteEquipo () {
    this->nombre = "sin nombre";
    this->precio = 0;
}

ComponenteEquipo::ComponenteEquipo (string nombre, int precio) {
    this->nombre = nombre;
    this->precio = precio;
}

ComponenteEquipo::ComponenteEquipo (const ComponenteEquipo &ce){
  this->nombre = ce.nombre;
  this->precio = ce.precio;
}

ComponenteEquipo& ComponenteEquipo::operator=(const ComponenteEquipo &ce){
    if (this != &ce){
      this->nombre = ce.nombre;
      this->precio = ce.precio;
    }
    return *this;
}

string ComponenteEquipo::getNombre () {
    return this->nombre;
}

int ComponenteEquipo::getPrecio () {
    return this->precio;
}
