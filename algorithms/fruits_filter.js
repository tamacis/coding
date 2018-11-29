var json = require('fs').readFileSync('./j').toString();

var flobj = JSON.parse(json);

console.log(flobj)

var fids = [];
flobj.fruits.forEach(function (fr) {
  fids.push(fr.id);
})
var olinks = flobj.links.filter(function (e) {

  console.log(e)
  if (fids.indexOf(e.source) || fids.indexOf(e.target)) {
  }
  else {
    return true;
  }
});

console.log(olinks);

