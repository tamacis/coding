'use strict';

var _fs = require('fs');

var fs = _interopRequireWildcard(_fs);

function _interopRequireWildcard(obj) { if (obj && obj.__esModule) { return obj; } else { var newObj = {}; if (obj != null) { for (var key in obj) { if (Object.prototype.hasOwnProperty.call(obj, key)) newObj[key] = obj[key]; } } newObj.default = obj; return newObj; } }

function _asyncToGenerator(fn) { return function () { var gen = fn.apply(this, arguments); return new Promise(function (resolve, reject) { function step(key, arg) { try { var info = gen[key](arg); var value = info.value; } catch (error) { reject(error); return; } if (info.done) { resolve(value); } else { return Promise.resolve(value).then(function (value) { step("next", value); }, function (err) { step("throw", err); }); } } return step("next"); }); }; }

let Router = require('koa-better-router');
let router = Router().loadMethods();

router.get('/', (ctx, next) => {
  ctx.body = fs.ReadStream('./public/index.html');
  console.log(next);
  return;
});

// can use generator middlewares
router.get('/foobar', (() => {
  var _ref = _asyncToGenerator(function* (ctx, next) {
    ctx.body = `Foo Bar Baz! ${ ctx.route.prefix }`;
    console.log(next);
    yield next;
  });

  return function (_x, _x2) {
    return _ref.apply(this, arguments);
  };
})());

let api = Router({ prefix: '/api' });

// add `router`'s routes to api router
api.extend(router);

// The server
let Koa = require('koa'); // Koa v2
let app = new Koa();

app.use(router.middleware());
app.use(api.middleware());

app.listen(4444, () => {
  console.log('Try out /, /foobar, /api/foobar and /api');
});