package hu.bme.mit.train.system;

import java.sql.Time;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TrainTachographe {

		public Table<Time, Integer, Integer> table;
		
		public TrainTachographe()
		{
			table = HashBasedTable.create();
		}
		
}
