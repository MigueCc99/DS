#include "VisitantePrecioDetalle.h"

VisitantePrecioDetalle::VisitantePrecioDetalle (){
    reiniciarVisitante();
}
void VisitantePrecioDetalle::visitarDisco (Disco d){
    detalle += "Nombre Disco: " + d.getNombre() + " Precio Disco: " + d.getPrecio() + " ";
}
void VisitantePrecioDetalle::visitarTarjeta (Tarjeta t){
    detalle += "Nombre Tarjeta: " + t.getNombre() + " Precio Tarjeta: " + t.getPrecio() + " ";
}
void VisitantePrecioDetalle::visitarBus (Bus b){
    detalle += "Nombre Bus: " + b.getNombre() + " Precio Bus: " + b.getPrecio() + " ";
}
void VisitantePrecioDetalle::reiniciarVisitante (){
    this->detalle = "";
}
string VisitantePrecioDetalle::getPrecioDetalle (){
    return detalle;
}