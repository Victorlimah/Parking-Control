package br.dcx.ufpb.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {

  @NotBlank
  private String parkingSpotNumber;

  @NotBlank
  @Size(min = 7, max = 7)
  private String licensePlateCar;

  @NotBlank
  private String brandCar;

  @NotBlank
  private String modelCar;

  @NotBlank
  private String colorCar;

  @NotBlank
  private String responsibleName;

  @NotBlank
  private String apartament;

  @NotBlank
  private String block;  
}
