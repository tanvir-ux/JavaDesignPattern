public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

// Output: 
// Displaying Mouse.
// Displaying Keyboard.
// Displaying Monitor.
// Displaying Computer.
