package br.ce.wcaquino.matchers;

import java.util.Calendar;

public class MatchersProprios {

	public static DiaSemanaMatcher caiEm(Integer diaSemana) {
		return new DiaSemanaMatcher(diaSemana);
	}
	
	public static DiaSemanaMatcher caiNumaSegunda(){
		return new DiaSemanaMatcher(Calendar.MONDAY);
	}

	public static DataDiferencaDias ehHojeComDiferencaDeDias(Integer diaSemana) {
		return new DataDiferencaDias(diaSemana );
	}

	public static DataDiferencaDias ehHoje(){
		return new DataDiferencaDias(0);
	}
}
