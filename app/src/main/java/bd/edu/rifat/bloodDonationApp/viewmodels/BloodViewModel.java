package bd.edu.rifat.bloodDonationApp.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import bd.edu.rifat.bloodDonationApp.entities.Blood;
import bd.edu.rifat.bloodDonationApp.repos.BloodLocalRepository;

public class BloodViewModel  extends AndroidViewModel {


    private BloodLocalRepository repository;


    public BloodViewModel(@NonNull Application application) {
        super(application);
        repository = new BloodLocalRepository(application);

    }

    public void addBloodDonar(Blood blood) {

        repository.addStudent(blood);

    }

    public LiveData<List<Blood>> getAllBloodDonar() {
        return repository.getAllDonars();
    }
}