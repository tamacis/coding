
const oo = require('json8');

// lazy
let json_data = JSON.stringify(require('./data.json').value);


let mappeds = oo.parse(json_data, {
	map : true
})

function flatten(m) {
	let r = [];
	// loop once
	m.forEach(function (v, k, m) {
		if (k instanceof Map) {
			flattenAsWhole(k)
		}
		r.push(v);
	})
	return r;
}

console.dir(mappeds);

console.dir(flatten(mappeds));

class FlattenMap {

	constructor() {
		this.maxdepth = 0;
	}

	push(obj) {

	}

}
