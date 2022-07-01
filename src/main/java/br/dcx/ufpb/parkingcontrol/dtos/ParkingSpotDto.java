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

  //gerar todos os metodos getters e setters
  public String getParkingSpotNumber() {
    return parkingSpotNumber;
  }

  public void setParkingSpotNumber(String parkingSpotNumber) {
    this.parkingSpotNumber = parkingSpotNumber;
  }

  public String getLicensePlateCar() {
    return licensePlateCar;
  }

  public void setLicensePlateCar(String licensePlateCar) {
    this.licensePlateCar = licensePlateCar;
  }

  public String getBrandCar() {
    return brandCar;
  }

  public void setBrandCar(String brandCar) {
    this.brandCar = brandCar;
  }

  public String getModelCar() {
    return modelCar;
  }

  public void setModelCar(String modelCar) {
    this.modelCar = modelCar;
  }

  public String getColorCar() {
    return colorCar;
  }

  public void setColorCar(String colorCar) {
    this.colorCar = colorCar;
  }

  public String getResponsibleName() {
    return responsibleName;
  }

  public void setResponsibleName(String responsibleName) {
    this.responsibleName = responsibleName;
  }

  public String getApartament() {
    return apartament;
  }

  public void setApartament(String apartament) {
    this.apartament = apartament;
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }
}
