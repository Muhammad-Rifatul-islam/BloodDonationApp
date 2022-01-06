package bd.edu.rifat.bloodDonationApp.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import bd.edu.rifat.bloodDonationApp.entities.Blood;

@Dao
public interface BloodDao {


    @Insert
    void insertBloodDonar(Blood blood);

    @Query("select * from tbl_blood")
    LiveData<List<Blood>> getAllDonars();
}
