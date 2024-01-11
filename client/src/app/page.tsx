import Image from 'next/image';
import Header from './components/Header';


export default function Home() {
  return (
    <main className="w-screen h-screen">
      <Header></Header>
      <section className="flex h-[82%] bg-primary w-full p-8 text-secondary items-center justify-center">
        <div className="flex flex-col gap-12 text-center">
          <div>
            <h1 className="text-4xl p-2">Text will go here</h1>

            <h2 className="text-2xl p-2">Message/description of the product</h2>
          </div>
          <div>
            <button className="bg-tertiary px-4 py-2 rounded-lg ">
              Create workout
            </button>
          </div>
        </div>
      </section>
    </main>
  );
}
