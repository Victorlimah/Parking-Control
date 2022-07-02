package br.dcx.ufpb.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.dcx.ufpb.parkingcontrol.models.ParkingSpotModel;
import br.dcx.ufpb.parkingcontrol.repositories.ParkingSpotRepository;


@Service
public class ParkingSpotService {
  
  final ParkingSpotRepository parkingSpotRepository;

  public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
    this.parkingSpotRepository = parkingSpotRepository;
  }

  @Transactional
  public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
    return parkingSpotRepository.save(parkingSpotModel);
  }

  public boolean existsByLicensePlateCar(String licensePlateCar) {
    return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
  }

  public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
    return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
  }

  public boolean existsByApartamentAndBlock(String apartament, String block) {
    return parkingSpotRepository.existsByApartamentAndBlock(apartament, block);
  }

  public List<ParkingSpotModel> findAll() {
    return parkingSpotRepository.findAll();
  }

  public Optional<ParkingSpotModel> findById(UUID id) {
    return parkingSpotRepository.findById(id);
  }
}
