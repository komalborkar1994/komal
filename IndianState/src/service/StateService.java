package service;

import entity.State;
import repository.StateRepository;

public class StateService {
	public void PrintMaharatraStateDetail() {
		
		State state =StateRepository.getMaharastaStateDetails();
		
		System.out.println(state.getStateName());
		System.out.println(state.getCMName());
		System.out.println(state.getDeputyCMName());
		System.out.println(state.getStateCapitalName());
		System.out.println(state.getStateName());
		System.out.println(state.getTotalDistrict());
		System.out.println(state.getTotalMLA());
		System.out.println(state.getTotalTaluka());
		
	}
	

}
