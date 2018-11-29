trait Foo {
    type Bar;
    fn boo(&self) -> Self::Bar;
}
trait Baz{}
// specify associated types for a trait you're impling another trait for
impl Baz for Foo<Bar=i32> {
   
}
fn main() {
    
}