package modules.cli.strategies;

public class Echo extends RespondWith {
    @Override
    public String respond(String query) {
        String result = query;
        return result + System.lineSeparator() + System.lineSeparator();
    }

}
