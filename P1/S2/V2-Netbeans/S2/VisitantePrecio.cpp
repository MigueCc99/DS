#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio (){
    reiniciarVisitante ();
}
void VisitantePrecio::visitarDisco (Disco d){
    precio += d.getPrecio();
}
void VisitantePrecio::visitarTarjeta (Tarjeta t){
    precio += t.getPrecio();
}
void VisitantePrecio::visitarBus (Bus b){
    precio += b.getPrecio();
}
void VisitantePrecio::reiniciarVisitante (){
    this->precio = 0;
}
int VisitantePrecio::getPrecio (){
    return this->precio;
}