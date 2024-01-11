import Image from 'next/image';
import Header from './components/Header';
import Section from './components/landingPage';
import Link from 'next/link';

export default function Home() {
  return (
    <main className="w-screen h-screen">
      <Header />
      <Section />
    </main>
  );
}
