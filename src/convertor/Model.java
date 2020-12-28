package convertor;

import java.math.BigInteger;

public class Model {

	static final double INITIAL_VALUE = 1;
	private double m_total;
	private String currency1;
	private String currency2;
	
	Model() {
	       reset();
	}
	public void reset() {
	       m_total = 1;
	}
	
	public void conversie(double value)
	{
		if(currency1 == currency2)
		{
			m_total = value;
		}
		if(currency1 == "RON")
		{
			if(currency2 == "EUR")
			{
				m_total = value * 0.21;
			}
			else
			{
				if(currency2 == "USD")
				{
					m_total = value * 0.25;
				}
			}
		}
		else {
			if(currency1 == "EUR")
			{
				if(currency2 == "RON")
				{
					m_total = value * 4.87;
				}
				else {
					if(currency2 == "USD")
					{
						m_total = value * 1.22;
					}
				}
			}
		}
	}
	public void setValue(double value) {
        m_total = value;
    }
    
  
   
}
