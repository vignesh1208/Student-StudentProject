package Programming;

import java.io.*;
import java.util.*;

public class TestClass 
{
	static int minParkingSpaces(int[][] parkingStartEndTimes) 
	{
		int[][] temp=new int[parkingStartEndTimes.length][2];
		int count=0;
		for(int i=0,j=0;i<parkingStartEndTimes.length;i++)
		{
			if(temp[0][1]==0)
			{
				temp[j][1]=parkingStartEndTimes[i][1];
				j++;count++;
				continue;
			}
			    aa:
				for(int k=0;k<j;k++)
				{
					
					if(parkingStartEndTimes[i][0]>temp[k][1])
					{
						temp[k][1]=parkingStartEndTimes[i][1];
						continue; 
					}
						
					if((parkingStartEndTimes[i][0]<temp[k][1]))
					{						
						if(k==temp.length-1 && parkingStartEndTimes[i][0]<temp[k][1])
						{	temp[j][1]=parkingStartEndTimes[i][0];
							count++;
							j++;
							break aa;
						}
						temp[j][1]=parkingStartEndTimes[i][0];
						count++;
						j++;
					}
				}
		}
		return count;
	}


	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}
		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);
		br.close();
	}
}