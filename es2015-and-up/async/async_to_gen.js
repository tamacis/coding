function _asyncToGenerator(fn) { return function () { var gen = fn.apply(this, arguments); return new Promise(function (resolve, reject) { function step(key, arg) { try { var info = gen[key](arg); var value = info.value; } catch (error) { reject(error); return; } if (info.done) { resolve(value); } else { return Promise.resolve(value).then(function (value) { return step("next", value); }, function (err) { return step("throw", err); }); } } return step("next"); }); }; }

class F {
  m() {
    return _asyncToGenerator(function* () {
      return 'yes';
    })();
  }
}

class G extends F {
  m() {
    console.log('called')
    return _asyncToGenerator(function* () {
      const r = yield F.prototype.m();
      console.log('works');
      return r;
    })();
  }
}

_asyncToGenerator(function* () {
const d = yield (new G()).m();
console.log(d);
})();

