package br.dcx.ufpb.parkingcontrol.repositories;

import br.dcx.ufpb.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

  // O JpaRepository fornece métodos para acessar o banco de dados.
  // Assim não precisamos fazer as queries manualmente.


}
