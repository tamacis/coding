let Router = require('koa-better-router')
let router = Router().loadMethods()

import * as fs from 'fs'

router.get('/', (ctx, next) => {
  ctx.body = fs.ReadStream('./public/index.html')
  console.log(next)
  return 
})

// can use generator middlewares
router.get('/foobar', async function  (ctx, next) {
  ctx.body = `Foo Bar Baz! ${ctx.route.prefix}`
  console.log(next)
  await next;
})

let api = Router({ prefix: '/api' })

// add `router`'s routes to api router
api.extend(router)

// The server
let Koa = require('koa') // Koa v2
let app = new Koa()

app.use(router.middleware())
app.use(api.middleware())

app.listen(4444, () => {
  console.log('Try out /, /foobar, /api/foobar and /api')
})
