package com.farkhodkhaknazarov.multymodel.main.presenter

import com.farkhodkhaknazarov.multymodel.main.ui.IBaseActivity
import moxy.MvpPresenter

class MainActivityPresenter: MvpPresenter<IBaseActivity>() {
    override fun onFirstViewAttach() {
        viewState.showNotification()
    }
}