import Koa from 'koa';
import MainContext from './context';

var app = new Koa();

// uses async functions
app.use(MainContext);

app.listen(3000);