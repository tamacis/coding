export default async (ctx) => {
    ctx.body = 'Hello world';
    await Promise.reject(new Error("Sync error"));
}