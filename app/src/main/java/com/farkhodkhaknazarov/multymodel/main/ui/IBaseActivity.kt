package com.farkhodkhaknazarov.multymodel.main.ui

import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(value = OneExecutionStateStrategy::class)
interface IBaseActivity: MvpView {
    fun showNotification()
}