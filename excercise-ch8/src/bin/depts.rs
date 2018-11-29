#[derive(Clone)]
enum Operations {
    add {shorttc},
    list,
    quit,
}

 phf::Map<&'static str, &'static str>

static OPERATIONS: phf::Map<&'static str, Keyword> = phf_map! {
    Operations::add =>
    "loop" => Keyword::Loop,
    "continue" => Keyword::Continue,
    "break" => Keyword::Break,
    "fn" => Keyword::Fn,
    "extern" => Keyword::Extern,
};