package com.awave.wrkout.onboarding

import com.awave.wrkout.R

class OnboardingPagePresenter(val view: OnboardingPageContract.View, private val data: Array<String>) : OnboardingPageContract.Presenter {
  init {
    view.presenter = this
  }

  override fun start() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun showPage(position: Int) {
    view.showText(data[position])
    view.showButtons(position)
  }
}