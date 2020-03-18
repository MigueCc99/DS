#include "Equipo.h"

Equipo::Equipo () {}

/*
Equipo::Equipo (Disco d, Tarjeta t, Bus b){
	this->bus = &b;
	this->tarjeta = &t;
	this->disco = &d;
}
*/

void Equipo::setBus(Bus *b) {
	bus=b;
}

void Equipo::setTarjeta(Tarjeta *t) {
	tarjeta=t;
}

void Equipo::setDisco(Disco *d) {
	disco=d;
}

Bus Equipo::getBus(){
	return *bus;
}

Tarjeta Equipo::getTarjeta(){
	return *tarjeta;
}

Disco Equipo::getDisco(){
	return *disco;
}
