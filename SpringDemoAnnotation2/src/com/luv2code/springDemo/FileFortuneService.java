package com.luv2code.springDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> theFortunes;
	private Random random = new Random();
	
	public FileFortuneService() {
		theFortunes = new ArrayList<String>();
		try {
			File file = new File("/home/vengatesh/Documents/data.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				theFortunes.add(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = random.nextInt(theFortunes.size());
		return theFortunes.get(index);
	}

}
