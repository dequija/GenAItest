import main.common.CalcFrequencies;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(multiplyByFrequency("Weekly", "8.50"));
    }
    
	protected String multiplyByFrequency(String calcFrequency, String num) throws Exception {
		String calcFrequency = "";
		Double freqMultiplier = 0.00;
		Double dNum = Double.parseDouble(num);
		
		switch(calcFrequency) {
		case "BiWeekly":
			freqMultiplier = 12.0/26.0;
			break;
		case "Monthly":
			freqMultiplier = 12.0/12.0;
			break;
		case "Semi-monthly":
			freqMultiplier = 12.0/24.0;
			break;
		case "Weekly":
			freqMultiplier = 12.0/52.0;
			break;
		default:
			throw new Exception("Calc Frequency unrecognized!");
		}
		
		dNum = dNum * freqMultiplier;
		
		return dNum.toString();
	}
}