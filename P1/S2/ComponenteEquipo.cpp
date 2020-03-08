#include "ComponenteEquipo.h"

ComponenteEquipo::ComponenteEquipo () {
    this->nombre = "sin nombre";
    this->precio = 0;
}

ComponenteEquipo::ComponenteEquipo (string nombre, int precio) {
    this->nombre = nombre;
    this->precio = precio;
}

string ComponenteEquipo::getNombre () {
    return this->nombre;
}

int ComponenteEquipo::getPrecio () {
    return this->precio;
}