package br.dcx.ufpb.parkingcontrol.services;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.dcx.ufpb.parkingcontrol.dtos.ParkingSpotDto;
import br.dcx.ufpb.parkingcontrol.models.ParkingSpotModel;
import br.dcx.ufpb.parkingcontrol.repositories.ParkingSpotRepository;


@Service
public class ParkingSpotService {
  
  final ParkingSpotRepository parkingSpotRepository;

  public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
    this.parkingSpotRepository = parkingSpotRepository;
  }

  @PostMapping
  public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto){
    var parkingSpotModel = new ParkingSpotModel();

    BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);

    parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
    return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotRepository.save(parkingSpotModel));
  }

  @Transactional
  public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
    return parkingSpotRepository.save(parkingSpotModel);
  }

}
