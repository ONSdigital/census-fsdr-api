package uk.gov.ons.fsdr.common.util;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class FixedPointFormatText{
	private String aline;
  private int lineLength;

	public FixedPointFormatText(int lineLength){
		super();
    this.lineLength = lineLength;
		aline = "";
	}

	public void clearLine(){
		aline = "";
		for(int x=0; x<lineLength; x++){
			aline = aline + " ";
		}
	}

	public void addStringToLine(String data, int pos, int l){
		String a,b,c;
		int x;
		char[] ca = new char[l];
		for (int i=0; i<ca.length; i++){
			ca[i] = ' ';
		}

		if (data==null) data = "";
		x = data.length();

		if (l<x) x=l;
		System.arraycopy(data.toCharArray(), 0, ca, 0, x);
		a = aline.substring(0, pos);
		b = aline.substring(pos+l, lineLength-1);
		c = new String(ca);
		aline = a + c + b;
	}

	public String getLine(){
		return aline;
	}

	private static int[] positionsOf(String str, String aline){
		int i = 0;
		int x = 0;
		String tmpLine = aline;
		while (tmpLine.indexOf(str)!=-1){
			i++;
			x = tmpLine.indexOf(str);
			tmpLine = tmpLine.substring(x+1);
		}

		int[] pOff = new int[i];
		i = 0;
		int lastValue = 0;
		tmpLine = aline;
		while (tmpLine.indexOf(str)!=-1){
			x = tmpLine.indexOf(str);
			tmpLine = tmpLine.substring(x+1);
			pOff[i] = x + lastValue;
			lastValue = pOff[i];
			i++;
		}
		return pOff;
	}

	public static String[] asLines(String sd, int lines, int length){
		boolean peed = false;
		int maxLength = length * lines;
		if (sd.length() < maxLength) {
			for (int x = 0; x < (maxLength-sd.length()); x++){
				sd = sd + " ";
			}
		}

		int[] pOff = positionsOf("\n", sd);

		String[] sdarray = new String[lines];
		char[]   cha     = new char[length*lines];
		for (int i=0; i<cha.length; i++){
			cha[i] = ' ';
		}

		String tempString = sd.replaceAll("\n","");
		int currentPos = 0;
		int crIndex = 0;
		int lineEnd = 0;
		for (int i = 0; i<lines; i++){
			peed = false;
			lineEnd = currentPos + length;
			if (tempString.length()-1<lineEnd){lineEnd = tempString.length()-1;}

			if ((pOff.length > 0)&&(crIndex<pOff.length)){
				if (pOff[crIndex] < lineEnd){
					lineEnd = pOff[crIndex]-1;
					crIndex++;
					peed = true;
				}
			}
			String line = "";


			line = tempString.substring(currentPos, lineEnd+1);
			if (peed) {
				currentPos  = lineEnd +1;
			}else{

				if (lineEnd<tempString.length()-1){
					if (line.lastIndexOf(" ")!=length){
						if (lineEnd < currentPos) currentPos = lineEnd;
						line = tempString.substring(currentPos, lineEnd);

						if ((line.lastIndexOf(" ")>1)&&(line.lastIndexOf(" ")<lineEnd)){
							lineEnd = line.lastIndexOf(" ") + currentPos;
						}else{
							lineEnd++;
						}
					}

					if (currentPos < lineEnd){
						line = tempString.substring(currentPos, lineEnd);
						line = line.trim();
						currentPos  = lineEnd +1;
					}
				}

				if (line.length() < length){
					int z = length - line.length();
					for (int y=0; y<z; y++){
						line = line + " ";
					}
				}
			}
			sdarray[i] = line;
		}

		return sdarray;
	}

}
