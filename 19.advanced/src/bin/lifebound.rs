// T: 'a bound specifies that T can be any type, 
// but if it contains any references, the references must live at least as long as 'a
struct Ref<'a, T: 'a>(&'a T);


// 'static lifetime bound to T to constrains
// T to types that have only 'static references or no references
struct StaticRef<T: 'static>(&'static T);

fn main() {

}