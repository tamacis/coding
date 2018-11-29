class BoxNewImproved {
    private int length = 0;
    private int height = 0;
    private int width = 0;

    BoxNewImproved () { 
        super(); 
    }
    BoxNewImproved (int length, int height, int width) throws InvalidMeasurementException {
        if (length <= 0 || height <= 0 || width <= 0) {
            throw new InvalidMeasurementException();
        }
        this.length = length;
        this.height = height;
        this.width = width;
    }

    int getVolume() throws InitializationIncompleteException {
        if (length <= 0 || height <= 0 || width <= 0 ) {
            throw new InitializationIncompleteException();
        }
        return (length * height * width);
    }
}