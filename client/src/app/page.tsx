import Header from './components/Header';
import LandingPage from './components/landingPage';

/* 
@notice this is the first thing the user sees upon page load.
Header height of 18% + section height of 82% should always add up to 100% (height of the users screen)
*/

export default function Home() {
  return (
    <main className="w-screen h-screen">
      <Header />
      <LandingPage />
    </main>
  );
}
