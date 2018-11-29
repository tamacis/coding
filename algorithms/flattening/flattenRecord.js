module.exports = function flattenRecord(result, parentName, rec) {
        return Object.keys(rec).reduce(function(result, key) {
            var value = rec[key],
            	name;
            if (/^[A-Za-z_]\w*$/.test(key)) {
            	// Valid identifier key, use dot syntax
				name = parentName + '.' + key;
            } else if (/^\d+$/.test(key)) {
            	// All numeric key, use array index syntax
            	name = parentName + '[' + key + ']';
            } else {
            	// key is not a valid identifier
            	name = parentName + '[\'' + key.replace(/'/g, '\\\'') + '\']';
            }
            if (value && (value instanceof Array || 
            		typeof value === 'object')) {
            	flattenRecord(result, name, value);
            } else if (name) {
            	result[name] = value;
            } else {
            	console.error('dropped', value)
            }
            
            return result;
        }, result);
    }