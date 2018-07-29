# EstadosDeUnSoldado



1. Crear la clase Soldado con un atributo del tipo int que represente los cm3 de sangre en su cuerpo, otro que represente la cantidad de aguejeros de bala que tiene un ultimo atributo que represente su estado de salud.


2. Los posibles estados son saludable o herido.


3. El soldado tiene un unico metodo: recibirDisparo.


4. Si esta en estado saludable y recibe un disparo, grita, deccrementa en 100cm3 el total de sangre, agrega un agujero de bala y pasa a estado herido.


5. Si esta en estado herido y recibe un disparo, grita mas fuerte, pierde la mitad de sangre que le queda, agrega otro agujero de bala y sigue en el mismo estado.
___________________________________________________________________________________________________________________________________________



6. Ahora agregar otro metodo: recibirCuracion.


7. Si esta en estado saludable y recibe curacion, dice "gracias, pero estoy saludable" y queda en el mismo estado.
8. Si esta en estado herido y recibe curacion, dice "gracias", decrementa un agujero de bala y pasa a estado saludable.
___________________________________________________________________________________________________________________________________________



9. Ahora agregar otro estado: muerto.


10. Si esta en estado saludable y recibe un disparo, grita, decrementa en 100cm3 el total de sangre, agrega un agujero de bala y pasa a estado herido.


11. Si esta en estado herido y recibe un disparo, grita mas fuerte, pierde sangre mas rapidamente, agrega un agujero de bala y queda en el mismo estado a menos que pierda toda la sangre donde pasa a estado muerto.


12. Si esta muerto y recibe un disparo, agrega un agujero de bala y queda en el mismo estado.


13. Si esta en estado saludable y recibe curacion, dice "gracias, pero estoy saludable" y queda en el mismo estado.


14. Si esta en estado herido y recibe curacion dice "gracias", decrementa un agujero de bala y pasa a estado saludable.
15. Si esta muerto y recibe curacion. grita "he revivido!", recuperoa toda su sangre, cierra todos los aguejeros de bala y pasa a estado saludable.
