trait GGraph<Node, Edge> {
    // methods would go here
}

trait AGraph {
    type Node;
    type Edge;

    // methods would go here
}

// With Generics
fn distance_g<N, E, G: GGraph<N, E>>(graph: &G, start: &N, end: &N) -> u32 {
    // --snip--
    0
}

// With assoicated types
fn distance_a<G: AGraph>(graph: &G, start: &G::Node, end: &G::Node) -> u32 {
    // --snip--
    0
}

// With trait objects.
fn distance_tg<N, E>(graph: &GGraph<N, E>, start: &N, end: &N) -> u32 {
    // --snip--
    0
}

fn traverse(graph: &AGraph<Node = usize, Edge = (usize, usize)>) {
    // --snip--
}

fn main() {}
