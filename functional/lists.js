class List {
  static empty(l) {
    return l.length === 0;
  }
  static first(l) {
    return l[0];
  }
  static rest(l) {
    return List.empty(l) ? [] : l.slice(1, l.length);
  }
  static cons(e, l) {
      return [e,...l]
  }
}

function sum(l) {
  if (List.empty(l)) {
    return 0;
  } else {
    return List.first(l) + sum(List.rest(l));
  }
}

function len(l, n = 0) {
  return List.empty(l) ? n : len(List.rest(l), n + 1);
}

function remove(item, l){
    if (List.empty(l)) {
        return [];
    } else if (List.first(l) == item) {
        return List.rest(l);
    } else {
        return List.cons(List.first(l), remove(item, List.rest(l)));
    }
}

console.log(sum([1, 2, 3, 4]));
console.log(len([1, 3, 4, 5, 2]));
console.log(remove('c', ['a', 'b', 'c', 'd']))
