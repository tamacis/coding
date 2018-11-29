

   var 2dArray = [
     [5,2],
     [4,6],
     [3,6],
     [8,9],
     [6,1]
   ],

var tagtables={};
tagtables.id=[];
tagtables.prio=[]
;
tagtables.type=[];

// Make it more complex
articles.forEach( function (a) {
   a.tags.forEach (function (t,i) {
   a.tags[i]=t.split("#");
   });
   console.log(a.tags);
});


// Make a  tag table
tagstable = {};
tagstable.ids=[];
tagstable.prio

/*
//console.log(Array.isArray(a.tags));
  lowest = a.tags.reduce( function(a,b) {
  console.log(b);
 var   _a = a.split("#");
 var  _b = b.split("#");
  if ( _b[1] > _a[1]) {
   if ( _b[0] > _a[0]) {
  return a;} else {return b}
  }
  });*/


// since prio and type


