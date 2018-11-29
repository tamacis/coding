class AssertionsOne {
    String state;
    
    AssertionsOne(String state) {
        this.state += state;
    }

    public static void main(String args[]){
        AssertionsOne t = new AssertionsOne("YES");
        assert (t.state.equals("YES")) : "Ut-oh!! unexpected result in state: "+t.state;
    }
}
