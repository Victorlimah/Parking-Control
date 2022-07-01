package br.dcx.ufpb.parkingcontrol.services;

import org.springframework.stereotype.Service;

import br.dcx.ufpb.parkingcontrol.repositories.ParkingSpotRepository;


@Service
public class ParkingSpotService {
  
  final ParkingSpotRepository parkingSpotRepository;

  public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
    this.parkingSpotRepository = parkingSpotRepository;
  }

}
