import Header from './components/Header';
import LandingPage from './components/landingPage';

/* 
@dev this is the first thing the user sees upon page load.
Header height of 14% + section height of 86% should always add up to 100% (height of the users screen)
*/

export default function Home() {
  return (
    <main className="w-screen h-screen">
      <Header />
      <LandingPage />
    </main>
  );
}
