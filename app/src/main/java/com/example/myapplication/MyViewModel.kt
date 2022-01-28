package com.example.myapplication

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class MyUseCase @Inject constructor(){

}

//Have at least one argument so the saved state handle factory won't work
@HiltViewModel
class MyViewModel @Inject constructor(useCase: MyUseCase) : ViewModel() {
}
