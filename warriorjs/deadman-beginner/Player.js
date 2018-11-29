import Observable from "zen-observable";

let _health = 25;
function isBeingAttacked(warrior) {
    return warrior.health() < _health ;
  }


    let health = new  Observable(observer=> {
     observer.next("hello");
    });


class Player {

  playTurn(warrior) {
    if(warrior.feel().isEmpty()) {
       if (isBeingAttacked(warrior)) warrior.walk(); return;
       if (warrior.health() < 16 ) { warrior.rest() }  
        else { warrior.walk()} 
    } 
    else {
      warrior.attack();
      _health = warrior.health();
    } 
  }
}
